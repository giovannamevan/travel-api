INSERT INTO tb_places (place_id, city, country) VALUES (1, 'Rio de Janeiro', 'Brasil');
INSERT INTO tb_places (place_id, city, country) VALUES (2, 'Sao Paulo', 'Brasil');
INSERT INTO tb_places (place_id, city, country) VALUES (3, 'Salvador', 'Brasil');
INSERT INTO tb_places (place_id, city, country) VALUES (4, 'Recife', 'Brasil');
INSERT INTO tb_places (place_id, city, country) VALUES (5, 'Curitiba', 'Brasil');

INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (1,'LATAM', '07-06-2023','Uberlandia', 714.00, 1);
INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (2,'GOL', '10-06-2023','Uberlandia', 870.08, 1);
INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (3,'LATAM', '12-06-2023','Uberlandia', 833.90, 1);

INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (4,'GOL', '07-06-2023','Uberlandia', 983.90, 2);
INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (5,'GOL', '08-06-2023','Uberlandia', 1003.90, 2);
INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (6,'LATAM', '12-06-2023','Uberlandia', 820.90, 2);

INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (7,'AZUL', '07-06-2023','Uberlandia', 783.40, 3);
INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (8,'LATAM', '12-06-2023','Uberlandia', 873.80, 3);
INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (9,'AZUL', '08-06-2023','Uberlandia', 741.10, 3);

INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (10,'GOL', '11-06-2023','Uberlandia', 933.90, 4);
INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (11,'GOL', '09-06-2023','Uberlandia', 734.00, 4);
INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (12,'LATAM', '07-06-2023','Uberlandia', 820.00, 4);

INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (13,'AZUL', '10-06-2023','Uberlandia', 230.41, 5);
INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (14,'GOL', '11-06-2023','Uberlandia', 473.00, 5);
INSERT INTO tb_tickets (ticket_id, company_name, departion_date, origin_local, ticket_price, place_id) VALUES (15,'LATAM', '09-06-2023','Uberlandia', 341.50, 5);


INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (1, 'Copacabana Palace', 1, 'Hotel 5 estrelas localizado em frente a Praia de Copacabana', 2500.00);
INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (2, 'Maraca UP', 1, 'Hotel 2 estrelas localizado ao lado do Estadio do Maracana, no bairro da Tijuca.', 200.00);
INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (3, 'Hotelinho da Urca', 1, 'Hotel 3 estrelas localizado no sope do Morro da Urca.', 400.00);

INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (4, 'Soul Hostel Av. Paulista', 2, 'Hotel 2 estrelas localizado ao lado do MASP.', 150.00);
INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (5, 'Green Place Ibirapuera', 2, 'Hotel 4 estrelas localizado proximo ao Parque Ibirapuera.', 300.00);
INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (6, 'Bourbon Convention', 2, 'Hotel 4 estrelas localizado proximo ao Aeroporto de Congonhas.', 400.00);

INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (7, 'Ibis Salvador Rio Vermelho', 3, 'Hotel 3 estrelas a poucos minutos da praia.', 230.00);
INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (8, 'Hotel Sempre Executive', 3, 'Hotel 3 estrelas proximo a estacao Acesso Norte.', 200.00);
INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (9, 'Bahia Flat', 3, 'Hotel 3 estrelas proximo a praia do Farol da Barra.', 250.00);

INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (10, 'Recife Plaza Hotel', 4, 'Hotel 3 estrelas localizado ao lado da Basilica.', 120.00);
INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (11, 'HY Beach Flats', 4, 'Hotel 3 estrelas localizado a 3 minutos a pe da Praia da Pina.', 250.00);
INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (12, 'Grand Mercure Recife Boa Viagem', 4, 'Hotel 4 estrelas em frente a Praia de Boa Viagem.', 300.00);

INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (13, 'Curitiba Casa Hostel', 5, 'Hotel 2 estrelas localizado a 1 km da Rodoviaria e do Jardim Botanico.', 150.00);
INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (14, 'Hotel Intercity Curitiba', 5, 'Hotel 3 estrelas a 15 minutos a pe do Museu Oscar Niemeyer.', 300.00);
INSERT INTO tb_hostings (hosting_id, hosting_name, place_id, description, daily_price) VALUES (15, 'Mercure Curitiba Aeroporto', 5, 'Hotel 4 estrelas a 2 km do Aeroporto Internacional.', 260.00);


INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (1, 'Cristo Redentor', 1, 'O Cristo Redentor eh o principal cartao-postal do Rio de Janeiro. Inaugurado em 12 de outubro de 1931, a estatua de bracos abertos para a Baia de Guanabara foi eleita uma das 7 maravilhas do mundo!', 30.00);
INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (2, 'Pao de Acucar', 1, 'Partindo da Praia Vermelha, os turistas pegam o primeiro bonde que leva ao Morro da Urca e de la um segundo bondinho os leva ate o topo do Morro do Pao de Acucar que fica a 396 metros do nivel do mar.', 100.00);
INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (3, 'Feira de Sao Cristovao', 1, 'O centro de tradicoes nordestinas Luiz Gonzaga, tambem chamada de feira de Sao Cristovao e um otimo lugar para se divertir e comer a culinaria nordestina.', 10.00);

INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (4, 'Museu de Arte de Sao Paulo', 2, 'O Masp, eh uma opcao de roteiro e de atracao. Em plena Avenida Paulista, conta com milhares de obras importantes de artistas renomados e faz jus a sua fama internacional.', 50.00);
INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (5, 'Pinacoteca', 2, 'E um dos mais importantes museus de arte do Brasil. Ocupa um edificio construido em 1900, no Jardim da Luz, centro de Sao Paulo, projetado por Ramos de Azevedo e Domiziano Rossi.', 15.00);
INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (6, 'Farol Santander', 2, 'e um dos principais centros de cultura, lazer e gastronomia da regiao central da capital paulista e ocupa o Edificio Altino Arantes, terceiro maior edificio de Sao Paulo.', 20.00);

INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (7, 'Elevador Lacerda', 3, 'E um sistema de transporte publico da cidade de Salvador, capital do estado brasileiro da Bahia. Trata-se do primeiro elevador urbano do mundo.', 0.15);
INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (8, 'Farol da Barra', 3, 'Localizado na antiga ponta do Padrao, atual Ponta de Santo Antonio, em Salvador. Foi o primeiro sistema de sinalizacao nautica a entrar em operacao nas Americas.', 15.00);
INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (9, 'Basilica do Senhor do Bonfim', 3, 'e a mais tradicional igreja de Salvador, quica a mais famosa do Brasil. Foi erguida na Colina Sagrada, a partir de 1745, e e em suas escadarias que ocorre a Lavagem do Bonfim.', 0.00);

INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (10, 'Praca do Marco Zero', 4, 'Ficou conhecida como Praca do Marco Zero pelo fato de que nela encontra-se o quilometro zero das estradas de Pernambuco. e formada por um marco de cor vermelha doado pelo Clube do Automovel.', 10.00);
INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (11, 'Instituto Ricardo Brennand', 4, 'Tambem conhecido como Castelo de Brennand, e uma instituicao cultural sem fins lucrativos. Foi eleito o melhor museu da America do Sul pelo site de viagens TripAdvisor.', 50.00);
INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (12, 'Museu Cais do Sertao', 4, 'Eh um museu interativo sobre o Sertao e Luiz Gonzaga localizado na cidade do Recife. Foi eleito um dos vinte melhores museus da America do Sul em 2015 pelos usuarios do site de viagens TripAdvisor.', 10.00);

INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (13, 'Jardim Botanico', 5, 'E um dos principais pontos turisticos da cidade. Em 2007 foi o monumento mais votado numa eleicao para escolha das Sete Maravilhas do Brasil, promovido pelo site Mapa-Mundi.', 0.00);
INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (14, 'Museu Oscar Niemeyer', 5, 'O formato inusitado fez que com que o Museu ganhasse o apelido de Museu do Olho. Projetado pelo arquiteto que da nome ao museu, o MON e o melhor espaco dedicado a arte na cidade de Curitiba.', 20.00);
INSERT INTO tb_tours (tour_id, tour_name, place_id, description, ticket_price) VALUES (15, 'opera de Arame', 5, 'Com estrutura tubular e teto transparente, e um dos simbolos emblematicos de Curitiba. Inaugurada em 1992, acolhe todo tipo de espetaculo, do popular ao classico.', 15.00);