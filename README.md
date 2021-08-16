# exampleSpringJDBC

### **1. Description**
* **MySQL**을 이용한 Spring JDBC 예제 프로그램입니다.


### **2. Environment**
* **Eclispe**
  + Maven Project(Create a single project(skip archetype selection))
* **Server**
  + Tomcat
* **Database**
  + MySQL
  
  
### **3. Packages**
* **conf**
  + Spring Container를 위한 설정 파일
  + **beans.xml**
* **dao**
  + DAO Class를 위한 패키지
  + DB에 접근하여 수행할 작업을 메서드로 구현
  + **OfferDao**
* **main**
  + 실제 작업을 수행할 Class를 위한 패키지
  + Spring Container를 생성하고, Dao 객체를 이용해 DB에 접근하여 작업을 수행
  + **MainApp**
* **model**
  + 애플리케이션에서 사용할 Model Class를 위한 패키지
  + **Offer**
* **props**
  + Database를 접근하기 위한 Property 정보
  + **jdbc.properties**


### **4. Files**
* **pom.xml**
  + spring-context
  + lombok
  + spring-jdbc
  + mysql-connector-java
  + commons-dbcp2
* **offer.sql**
  + 예제 프로그램을 위한 MySQL Table Schema & Data 파일
