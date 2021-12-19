# SpringBoot-DATA-JPA-29
JPA +DDL+Entity+table+primeryKey+repository+basic CRUD+table realations+singular+smart dialect </br>
JPA- Java Persistence Access</br>
DDL-How to work with java </br>
table by code-create a Bean and his relations and the Hibernet will aoutomaticly build Tables and thier connetions.<br/>
dependcies : Lombok,spring data JPA,WEB,MySQL</br>
 set connection to DB on Application properties.</br>
 @Entity-will replace the @Componnet annotation when i work with JPA in order to connect the class to springboot.</br>
 @Table(name="")-chang table name .</br>
@Id -primery key <br/>  @GeneratedValue -create auto increment in database level <br/>
@GeneratedValue (strategy = GenerationType.IDENTITY) : 
1. table , any generated value on item, will be counter<br/>
2. identity, will work on each field alone <br/>
3. ther are more stategies just like ALL ,IDENTITY and more...<br/>
@Column(nullable = false, length = 40,name="set colum new name") - the field can not be nullable (not null) and size 40 <br/>
@Repository -will be written on above interface (not must) that impliment JPARepository<the Entitiy, Generic data type of the spesific Entity ID ><br/>
JPARepository interface will give us 50% of our dialect in order to crerat basice CRUD.<br/>
1. 50% -  CRUD (Repository)
2. 40% - Smart Dialect - U can find all of them here : https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#jpa.query-methods.query-creation
3. 10% - SQL COMMANDS

table relations :@OneToOne, @OneToMany, @ManyToMany, @ManyToOne.<br/>
@Singular- come frome lombok ,will let me the options to create manualy obj one by one ...<br/>












