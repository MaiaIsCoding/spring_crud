<h1> Spring Hibernate e Spring REST </h1>

### Hibernate

Foi criado um projeto Hibernate (spring_vendas) e um projeto REST (rest_api)
todos os JARs necessários para executar o programa se encontram `/spring_vendas/WebContent/WEB-INF/lib`
E um banco de dados MySQL em comum utilizado pelos dois com duas tabelas: Vendedor e Vendas

```
CREATE TABLE `vendedor` (
`id` int NOT NULL AUTO_INCREMENT,
`nome` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`))
ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
```

```
CREATE TABLE `vendas` (
`id` int NOT NULL AUTO_INCREMENT,
`data_venda` date DEFAULT NULL,
`valor` varchar(45) DEFAULT NULL,
`vendedor_id` int DEFAULT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (vendedor_id) references vendedor(id))
ENGINE=InnoDB AUTO_INCREMENT=501 DEFAULT CHARSET=latin1;
```

É possível visualizar os dados dos vendedores, mas a incompatibilidade entre SQL e HQL foi um limitador no desenvolvimento do projeto.
Para mostrar a funcionalidade de receber um parametro da view e gerar uma query especifica, foi criada a funcionalidade de fazer uma query
sobre um vendedor especifico utilizando o campo `Data Inicial`. As queries que não foram implementadas seriam as seguintes com suas respectivas funcionalidades

- Mostrar o nome do vendedor. Tabela (vendas) 
**select vendas.*, vendedor.nome from vendas left join vendedor on vendas.vendedor_id = vendedor.id;**

- Total de vendas do vendedor. Tabela (vendedor) 
**select vendedor.*, count(vendas.vendedor_id) as total_vendas from vendedor left join vendas on vendas.vendedor_id = vendedor.id 
group by vendedor.id, vendedor.nome;**

- Total de vendas do vendedor dentro de um periodo. Tabela (vendedor)
** select vendedor.*, count(vendas.vendedor_id) as total_vendas from vendedor
left join vendas on vendas.vendedor_id = vendedor.id and vendas.data_venda between '05-04-2015' and '05-07-2021'
group by vendedor.id, vendedor.nome;**

Também é possível visualizar a tabela de vendas, seus resultados e adicionar novas vendas que afetam a contagem de vendas totais dos vendedores

### REST 

Foi criado um novo projeto Spring Boot e adicionado as dependencias:

- spring-webmvc (5.0.6)
- spring-tx (5.0.6)
- spring-orm (5.0.6)
- jackson.core (2.9.5)
- hibernate-core (5.1.0)
- mysql-connector-java (5.1.45)
- c3p0 (0.9.5.2)
- javax.servlet-api (3.1.0)
- javax.servlet-jsp-api (2.3.1)

Devido as restrições de tempo a REST API não pode ser finalizada de acordo com os parametros
estipulados por erros de comunicação com a `SessionFactory` que dificultaram o desenvolvimento do projeto
