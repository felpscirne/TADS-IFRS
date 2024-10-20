# Design De Interação - Trabalho 1

Trabalho 1 de JavaScript
1- Fazer um painel com elementos gráficos e um painel de controles que irão alterar estes elementos
gráficos.
Os controles devem ser formulários e/ou botões estilizados. Alterações nos valores e posições dos
formulários e botões causam alterações no painel gráfico. O painel gráfico deve ser uma div com
outros elementos dentro.
Via formulário de controle pode-se mudar cor de fundo, borda, texto, figura, etc de uma div que
será o cartão. Também é possível mudar tamanhos de elementos e movê-los.
Através dos controles o gadget deve alterar no painel gráfico:
- Pelo menos 5 aspectos gráficos
- Pelo menos 1 deles deve ter alteração de tamanho
- Pelo menos 1 deles deve ter alteração em elemento textual
O formulário de controle e o painel gráfico ficam na mesma página e conforme o usuário vai
alterando o formulário ele já vai vendo o resultado no painel.
É uma página para o usuário final, todo visual da página conta.
Evite possíveis erros do usuário (impedir inserção de dados errados, apagar/desabilitar campos já
respondidos, limitar o número de opções,...)
Caprichar no visual do gadget, colocar título, bordas, fundos, etc.
O gadget deve ser responsivo e rodar no desktop e no celular:
• deve passar pelo validador da w3c sem erros (https://validator.w3.org/). Em todas as fases
do gadget.
• não deve apresentar erros pegos pelo console do JavaScript(JS) dos navegadores.
• Usar css, bootstrap ou outro framework css para dar um bom visual ao gadget.
O gadget deve ser disponibilizado no github. O link para o repositório e o github pages do trabalho
deve ser informado no SIGAA.
Sugestão:
- O arquivo 11painel.html mostra uma estrutura básica de um controle e painel. O uso do evento
“input” no JS e do campo “range” no html da uma boa dinâmica ao painel/controle.
- O arquivo 10classlist.html também mostra uma interação com botões que possibilitam mudanças
grandes no painel com um código bem enxuto.
- Os gráficos e interações não precisam ter muita utilidade (além do entretenimento gráfico),
entretanto quem conseguir criar uma boa lógica/utilidade para a dupla painel/controle pode ter um
ponto extra. (simular análise de dados estatísticos, montar dinamicamente a fachada de uma
casa….)
