# Desafio Tech Insiders - Itaú
## Contexto
Atualmente uma das áreas de maior demanda de soluções rápidas para a tomada de decisão é a área de Cartões de Pagamentos. Pelo fato dos pagamentos terem um volume cada vez maior a cada dia, há também a necessidade de controle de fraudes de pagamentos (clonagem de cartões, uso não autorizado, entre outros). Por conta disso, existe uma base de dados no Banco que é alimentada com os dados transacionais oriundos dos principais agentes financeiros parceiros da instituição.
## Objetivo
O objetivo deste projeto é a criação de um "DashBoard" para rápida tomada de decisão por parte dos gestores e dos analistas de negócios. Um Dashboard é uma aplicação OLAP que concentra informações de histórico e também consolidação de informações relevantes. Dentre as informações relevantes para um DashBoard de tomada de decisão, temos:
- Seleção do agente financeiro parceiro
- Exibição do número de transações no dia
- Exibição do número de transações com sucesso
- Exibição do número de transações com falha (ex por saldo insuficiente)
- Exibição do número de transações com suspeita/identificação de fraude

## Milestones e Entregáveis
Sugere-se como forma de organização do projeto, que ele seja dividido em histórias (stories) em um ciclo de desenvolvimento ágil. Para tanto, algumas histórias são descritas a seguir:
### História 1: Login do Usuário.
Nesta história todo o caminho do usuário para seu login bem sucedido (ou falha) deve estar contemplado
### História 2: Tela de Seleção dos Agentes Parceiros
Nesta história, desenvolva toda a interface de front-end e back-end para exibir o drop-down para seleção do agente parceiro, bem como a tabela com os Top 10 agentes e seus respectivos volumes transacionais
### História 3 : DashBoard
Nesta história, desenvolva a recuperação das transações (pode ser de forma separada por tipo de transação, ou mesmo de forma agrupada, como preferir). A exibição deverá ser feita de maneira intuitiva para que o usuário tenha a melhor experiência possível.
