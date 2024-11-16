let dino = document.getElementById("dino");
let cactus = document.getElementById("cactus");
let btnIniciar = document.getElementById("btnIniciar");
let btnReiniciar = document.getElementById("btnReiniciar");
let scoreElement = document.getElementById("score");
let highScoreElement = document.getElementById("high-score");
let btnPular = document.getElementById("btnPular");
let gameOverElement = document.getElementById("game-over");
let gameOverScoreElement = document.getElementById("scoreFinal");
let rules = document.getElementById("rules");
let btnRules = document.getElementById("btnRegras");
let btnCloseRules = document.getElementById("btnVoltar");

let backgroundMusic = new Audio("sounds/background.mp3");
let gameOverSound = new Audio("sounds/gameover.mp3");

let jumping = false;
let score = 0;
let highScore = localStorage.getItem("highScore") || 0;
let gameInterval;
let gameRunning = false; 
let cactusInterval;
let cactusSpeed = 3; // Velocidade inicial dos cactos em segundos

highScoreElement.textContent = highScore;

backgroundMusic.loop = true;
backgroundMusic.volume = 0.2;

btnIniciar.addEventListener("click", startGame);
btnReiniciar.addEventListener("click", resetGame);
btnRules.addEventListener("click", showRules);
btnCloseRules.addEventListener("click", hideRules);

function startGame() {
    if (gameRunning) return; // Evita iniciar o jogo se já estiver rodando

    backgroundMusic.play();
    rules.style.display = "none";
    score = 0;
    scoreElement.textContent = score;
    gameRunning = true;
    cactusSpeed = 5; // Resetar a velocidade dos cactos

    gameInterval = setInterval(updateGame, 50);
    moveCactus();
    btnPular.addEventListener("click", handleJump);
    document.addEventListener("keydown", handleJump);
    document.getElementById("btnIniciar").style.display = "none";
    document.getElementById("btnReiniciar").style.display = "none";
}

function resetGame() {
    clearInterval(gameInterval);
    clearInterval(cactusInterval);
    gameRunning = false;
    score = 0;
    scoreElement.textContent = score;
    gameOverElement.style.display = 'none';
    startGame();
}

function stopGame() {
    gameRunning = false; 

    backgroundMusic.pause();
    backgroundMusic.currentTime = 0;
    clearInterval(gameInterval); 
    clearInterval(cactusInterval); 
    document.getElementById("btnReiniciar").style.display = "block";
    console.log("Jogo Parado!");
}

function handleJump() {
    if (!gameRunning || jumping) return;
    jumping = true;

    let jumpHeight = 10;
    let maxJumpHeight = 220;
    let goingUp = true;

    let jumpInterval = setInterval(() => {
        if (goingUp && jumpHeight >= maxJumpHeight) {
            goingUp = false; // Começa a descer
        }
        if (!goingUp && jumpHeight <= 10) {
            clearInterval(jumpInterval); // Para o pulo ao voltar ao chão
            jumping = false;
        }

        jumpHeight += goingUp ? 10 : -10; // Aumenta ou reduz a altura
        dino.style.bottom = jumpHeight + "px"; // Ajusta a posição
    }, 20);
}

function moveCactus() {
    let cactusPosition = 100; // Posição inicial (100% da tela)

    // Garante que o intervalo seja limpo antes de criar outro
    clearInterval(cactusInterval);

    cactusInterval = setInterval(() => {
        if (!gameRunning) return; 

        cactusPosition -= 5; 
        if (cactusPosition <= -50) {
            cactusPosition = 100; 
        }
        cactus.style.left = cactusPosition + "%"; 
    }, cactusSpeed * 10); 
}

function updateGame() {
    let dinoRect = dino.getBoundingClientRect();
    let cactusRect = cactus.getBoundingClientRect();

    // Detectar colisão
    if (
        dinoRect.right > cactusRect.left &&
        dinoRect.left < cactusRect.right &&
        dinoRect.bottom > cactusRect.top
    ) {
        gameOver();
    }

    // Atualizar pontuação
    score++;
    gameOverScoreElement.textContent = score;
    scoreElement.textContent = score;
    if (score > highScore) {
        highScore = score;
        localStorage.setItem("highScore", highScore);
        highScoreElement.textContent = highScore;
    }

    
    if (score % 350 === 0) {
        cactusSpeed -= 0.3; // Diminuir o intervalo (aumentar a velocidade)
        moveCactus(); // Reiniciar o movimento do cacto com a nova velocidade
        backgroundMusic.volume += 0.1;
        backgroundMusic.playbackRate += 0.1;
    }
}

function gameOver() {
    gameOverSound.play();
    stopGame();
    gameOverElement.style.display = "block";
    clearInterval(gameInterval);
    clearInterval(cactusInterval);
    cactus.style.left = "100%"; // Resetar a posição do cacto
    btnReiniciar.style.display = "block";
    document.removeEventListener("keydown", handleJump);
    document.removeEventListener("touchstart", handleJump);
}

function showRules() {
    if(gameRunning) return;
    gameOverElement.style.display = "none";
    gameOverScoreElement.style.display = "none";
    rules.style.display = "block";
    btnCloseRules.style.display = "block";
}

function hideRules() {
    rules.style.display = "none";
    btnCloseRules.style.display = "none";
    gameOverElement.style.display = "block";
    gameOverScoreElement.style.display = "block";
}