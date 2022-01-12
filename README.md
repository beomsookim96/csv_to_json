## eiegene 코딩테스트 -김범수-

<br>

csv파일을 파싱하여 H2 DB에 저장한 후 타겟상품을 검색하여 타겟상품 정보와 추천상품의 정보를 관련도 순으로 정렬하였습니다.  
또 그것을 JSON데이터로 출력했습니다.

<br>

### 환경
1. Language : java 11.0.11  
2. Framework : Spring Boot 2.6.1  
3. Build tool : Gradle  
4. Database : H2 database server  
5. Library : junit 4.13.1, lombok, jackson-databind 2.13.1  
6. IDE : IntelliJ
7. OS: windows 11  
8. localhost port : 8080  

<br>

### 진행과정
1. 프로젝트 생성
2. DB 설계 및 DB모델링
3. 데이터베이스 구축과 DTO, Entity, Repository 생성
4. csv파싱 후 Entity로 변환시키는 클래스 생성.
5. 어플리케이션 실행시 table 생성과 초기 csv 데이터가 insert되도록 구현.
6. 필요한 정보를 획득하기위한  쿼리문 작성 (Repository).
7. DAO를 실행시킬 Service Interface와 ServiceImpl Class 생성.
8. RESTController의 getProduct 메서드 작성

<br>

### 세부과정
####1.프로젝트 생성
IntelliJ 에 내장되어있는 Spring Initializer 를 통해 Spring Boot 2.6.1 프로젝트를 생성했습니다.  
이 과정에서 Spring web, lombok, h2 DB, Spring-data-jpa, junit 4.13.1을 선택했으며 빌드도구는 Gradle을 선택했습니다.  
Gradle을 선택한 이유는 Maven 보다 빠른 빌드속도를 가졌다는 장점으로 인해 사용해보았습니다.  
이후 application.properties 파일의 형식을 한 눈에 잘 들어오는 yml로 변경하고 csv파일을 resources 폴더에 넣었습니다.

<br>

#### 2.DB 설계 및 DB모델링
csv파일의 컬럼 형식에 맞춰 모델링을 하였으며 item_id 가 product 테이블의 PK이고  
rec 테이블의 PK는 target_item_id와 result_item_id를 복합키로 설정한 RecId입니다.

<br>

#### 3.데이터베이스 구축과 DTO, Entity, Repository 생성
DB구축은 Spring Boot에 내장되어있는 H2 DB server 를 사용하였습니다.  
Entity,Repository를 생성하고 Entity를 남용하지 못하도록 용도에 맞는 DTO를 생성했습니다

<br>

#### 4. csv파싱 후 Entity로 변환시키는 클래스 생성.
csv를 파싱하는 helper class를 생성했습니다. ,을 기준으로 문자열을 split하여 Builder를 통해 Entity로 변환시킵니다.

<br>

#### 5. 어플리케이션 실행시 table 생성과 초기 csv 데이터가 insert되도록 구현.
ApplicationListener<ContextRefreshedEvent>를 implements 하는 class를 구현하여 Override한 onApplicationEvent(ContextRefreshedEvent event) 메서드를 사용하여  
어플리케이션 시작시에 csv파일을 DB에 Table을 만들고 초기 데이터를 insert하도록 했습니다.

<br>

#### 6. 필요한 정보를 획득하기위한  쿼리문 작성 (Repository).
추천 상품을 select하는 로직을 위해 Repository에 @Query() 를 사용하여 커스텀 쿼리문을 작성했습니다.


<br>

#### 7. DAO를 실행시킬 Service Interface와 ServiceImpl Class 생성.

Controller의 역할을 명확히 분리시키고자 Service단을 작성했습니다.

<br>

#### 8. RESTController의 getProduct 메서드 작성

마지막으로 JSON데이터를 출력할 로직으르 Controller에 작성하였습니다.

###최종 산출물
  
  <br>
  
![image](https://user-images.githubusercontent.com/87082855/149232824-4cdaa8fc-0642-44ea-ab9b-f0652305c204.png)
  
  <br>
![image](https://user-images.githubusercontent.com/87082855/149233005-6fdc2c7b-b026-4c76-8ff3-33f1a13ce87d.png)
