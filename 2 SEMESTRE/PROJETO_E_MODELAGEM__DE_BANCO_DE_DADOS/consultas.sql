\c garagem_coletiva;

SELECT placa, ano FROM Veiculo WHERE chassi = 'CHASSI';

SELECT placa, ano FROM Veiculo WHERE ano >= 2000;

SELECT placa, cor, ano FROM Veiculo WHERE modelo_id = 1;

SELECT vaga_id, data_hora_entrada, data_hora_saida, valor_pago FROM Estacionamento WHERE chassi_veiculo = 'CHASSI';

SELECT EXTRACT(EPOCH FROM (data_hora_saida - data_hora_entrada)) / 3600 AS horas_ocupadas FROM Estacionamento WHERE chassi_veiculo = 'CHASSI' AND vaga_id = 'VAGA';

SELECT COUNT(*) FROM Veiculo WHERE modelo_id = 'MODELO';

SELECT AVG(EXTRACT(YEAR FROM AGE(data_nascimento))) AS idade_media FROM Cliente;

SELECT chassi_veiculo, SUM(FLOOR(EXTRACT(EPOCH FROM (data_hora_saida - data_hora_entrada)) / 3600) * 2) AS total_pago FROM Estacionamento GROUP BY chassi_veiculo;









