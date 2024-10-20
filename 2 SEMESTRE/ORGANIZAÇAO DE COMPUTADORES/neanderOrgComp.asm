
ORG 0      ; Define a origem do código na memória

; Programa principal
LDA 10     ; Carrega X no acumulador
SUB 11     ; Subtrai Y do acumulador
ADD 12     ; Adiciona Z ao acumulador
STA 13     ; Armazena o resultado em A
NOP        ; Finaliza o programa

; Dados
ORG 10     ; Define a origem dos dados na memória
X:  5      ; Valor de X (exemplo)
Y:  3      ; Valor de Y (exemplo)
Z:  7      ; Valor de Z (exemplo)
A:  0      ; Inicializa A com 0
