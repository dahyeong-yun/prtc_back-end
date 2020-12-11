- 출처 : <https://programmers.co.kr/learn/courses/11186>

## 🎒 사전 필요 지식 및 예습 가이드

- Java, Spring에 대한 기본 이해는 무조건 필수
- `spring-boot`,  `spring-web-mvc`,  `spring-jdbc` , `JdbcTemplate`
- 기본적인 SQL 작성능력. `join` 정도는 쓸 수 있어야 함.
- `Spring Security` 에 대해 둘러보고 오기

## 예습 사항 :pencil:

Java, Spring은 알지만 다른 키워드는 잘 모르겠거나, 학원 등에서 미리 세팅해준 프로젝트 없이는 뭔가 시작하지 못하는 수준이라면 아래의 추천 도서를 예습해오는 것을 권장합니다.

- 초보 웹 개발자를 위한 스프링5 프로그래밍 입문 / 최범균 저, 2018년 7월판
- Spring Boot 와 관련된 도서 / 본인 마음에 드는 것으로 아무거나

### Maven

프로젝트 빌드 도구로 Maven을 사용합니다. Maven에 대해 깊이 알 필요는 없지만 어느정도 쓸 수는 있어야 스터디를 따라가는데 문제가 없습니다. Maven에 대한 기본적인 내용은 [여기에서 확인](https://wikidocs.net/book/1910) 해보고 참여해주세요.

### IDE

IntelliJ를 사용하고, Community 버전을 사용해도 상관없습니다. 만약 본인이 Eclipse 유저라면 그대로 써도 상관이 없습니다. 본인이 익숙한 IDE를 쓰세요.

IntelliJ, Eclipse 에서 Github 연동방법, Maven 프로젝트를 다루는 방법 등을 알아두시면 스터디를 진행하는데 도움이 됩니다. 아래 유투브 링크도 참고하시고, 부족하다면 IntelliJ와 Maven, Spring Boot 같은 키워드로 검색해보면 많은 자료를 쉽게 찾을 수 있습니다.

- [Create Spring Boot Project with IntelliJ Community (FREE) Edition in 5 mins](https://www.youtube.com/watch?v=397QPCAjm0o)
- [2.Spring Boot Hello World Example in Eclipse](https://www.youtube.com/watch?v=Bro59wWFOgo)

### REST API 클라이언트 활용하기

- 스터디에서는 REST API 클라이언트로 Postman를 사용합니다.
- 다른 REST API 클라이언트로 [Insomnia](https://insomnia.rest/)도 많이 사용합니다.
- 본인이 익숙한 도구를 선택하세요.

------

그 외에 아래의 것들도 참고하면 많이 도움이 됩니다. 참고자료로 활용할 수 있도록 좋은 내용을 공유해주신 개발자분들께 감사드립니다.

### Spring Security

- [Spring Security의 요청 처리 절차](https://springsource.tistory.com/80) by 신관영
- [Spring Security의 자원 접근 판단에 대한 설명](https://zgundam.tistory.com/57?category=430446) by 메이킹러
- [스프링 시큐리티 구조 이해](https://www.slideshare.net/madvirus/ss-36809454) by 최범균
- [Spring Framework - Spring Security](https://www.slideshare.net/analizator/spring-security-framework) by Dzmitry Naskou

### HTTP Session

- [HTTP Session 이란?](https://mohwaproject.tistory.com/entry/HTTP-Session-이란) by 전성균

### JWT

- [JWT에 대해서](https://blog.outsider.ne.kr/1160) by Outsider
- [JSON Web token 소개 및 구조](https://velopert.com/2389) by Velopert
- [JWT 공식 웹사이트](https://jwt.io/)

### Swagger

- [Spring REST API에 Swagger 2 설정하기](https://springboot.tistory.com/24) by 스프링부트는 사랑입니다
- [Spring REST API 문서를 Swagger로 만들자](https://yookeun.github.io/java/2017/02/26/java-swagger) by 와이케이
- [Spring Boot 2 RESTful API Documentation With Swagger 2 Tutorial](https://dzone.com/articles/spring-boot-2-restful-api-documentation-with-swagg) by Ramesh Fadatare
- [Spring REST Docs API 문서를 자동화 해보자](https://www.popit.kr/spring-rest-docs/) by Yun

### Spring에서 Validation

- [Java 와 Spring 의 Validation](https://medium.com/@gaemi/java-와-spring-의-validation-b5191a113f5c) by 송정훈

### AWS S3

- [Java용 AWS SDK 개발자 가이드](https://docs.aws.amazon.com/ko_kr/sdk-for-java/v1/developer-guide/examples-s3-objects.html)
- [Spring boot 환경에서 Amazon s3에 이미지파일 업로드하기](http://jmlim.github.io/spring/2018/12/06/spring-amazon-s3-img/) by jmlim

### 예외처리 가이드

- [Exception 처리](https://www.slipp.net/questions/350) by benelog
- [Java 예외(Exception) 처리에 대한 작은 생각](http://www.nextree.co.kr/p3239/) by Nextree
- [Exception(예외)를 처리하는 좋은 방법이 뭘까?](http://blog.naver.com/PostView.nhn?blogId=kbh3983&logNo=220826883989) by 뽕

### logback, log4j2.xml 로그파일 롤링 설정

- [log4j2.xml example](https://www.mkyong.com/logging/log4j2-xml-example/) by mkyong
- [logback.xml Example](https://www.mkyong.com/logging/logback-xml-example/) by mkyong