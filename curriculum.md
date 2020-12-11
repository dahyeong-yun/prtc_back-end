- 출처 : <https://programmers.co.kr/learn/courses/11186>

#### 🗓 1주차

##### 내 손으로 직접 Maven 기반 Spring Boot 프로젝트 셋업하기

##### 1주차 미션 핵심

- ✅ Spring 주요 개념 (이미 알아도 다시)제대로 짚고 가기
- ✅ Spring Boot 개론(Spring 3.* 버전만 사용해본 경우, 필수 내용)
- ✅ Maven 프로젝트 직접 세팅

IDE는 IntelliJ, Eclipse 둘 중 본인이 편한 것을 써도 된다. 또한, 프로젝트 셋업은 모두 준비된 것을 주어주지 않는다. 앞으로의 미션 수행을 위해 직접 세팅하는 것 이 중요하다. 매번 누가 던져준 환경에서만 개발해본 경우에는 꼭 초반에 셋업 부분을 제대로 이해하고 넘어가야 한다.

[1주차 온라인 세션] 1/7(목) 20:30 ~ (약 2~2.5시간 소요)

#### 🗓 2주차

##### 인증과 인가(Authentication and Authorization)

##### 2주차 미션 핵심

- ✅ Spring Security를 활용한 인증(Authentication)
- ✅ 서비스 확장 시 Session 기반 사용자 인증의 문제점 알기
- ✅ 장애 대응을 위한 분산서비스 구조
- ✅ Stateless 아키텍처와 JWT(JSON Web Token)

우리는 보통 웹 백엔드 공부를 시작할 때, 쿠키나 세션을 통한 인증 처리 위주로 배우곤 한다. 그런데 실무에선 서비스가 커지면서 이용자가 많아지면 세션이 무척 바빠지면서 서버가 뻗을 수 있다. 세션 없이, 클라이언트의 상태를 저장하며 서비스 안정성을 취할 방법이 없을까? 여기에 대한 답을 찾아보는 시간.

[2주차 온라인 세션] 1/14(목) 20:30 ~

#### 🗓 3주차

##### 비즈니스 로직 처리(1)

##### 3주차 미션 핵심

- ✅ API 문서 자동화를 위한 Swagger
- ✅ 비즈니스 로직 개발 시 주의할 점
- ✅ 비즈니스 로직 개발(포스팅 관련 기능 구현)

왜 API 문서를 굳이 만들어야 하는걸까? 안그래도 할 일 많은데...가 아니라, 실무에서 프론트엔드 개발자와 백엔드 개발자의 소통을 위해 반드시 신경써야 할 부분이다. API가 한 두개가 아니고, 계속 변하니까 더욱 문서화는 중요하다. 3주에는 포스트(post) 기능을 위해 필요한 API를 구현하며 문서화 부분까지 챙겨보자. 나 혼자 읽을 소장용 문서가 아니라, 다른 개발자가 읽을거라고 가정하고!

[3주차 온라인 세션] 1/21(목) 20:30 ~

#### 🗓 4주차

##### 비즈니스 로직 처리(2)

##### 4주차 미션 핵심

- ✅ AWS S3 연동하기
- ✅ 예외처리 가이드
- ✅ 비즈니스 로직 개발(포스팅 댓글 관련 기능 구현)

코멘트 추가, 코멘트 목록 조회 기능을 구현하며 REST API를 구현한다. 2주차 미션과 이어지는 부분으로, 모든 REST API와 관련 모델에 대해서는 Swagger를 통해 문서화를 반드시 해야 함.

[4주차 온라인 세션] 1/28(목) 20:30 ~



#### 🗓 5주차

##### 마이크로서비스(Microservice)

##### 5주차 미션 핵심

- ✅ 도메인 이벤트
- ✅ 이벤트 시스템
- ✅ Apahce Kafka
- ✅ 댓글 알림 기능 구현

도메인 이벤트를 정의해보고 이벤트 시스템을 이용해서 해당 도메인 이벤트를 처리해 봅니다. 그리고 마이크로 서비스 환경에서 이벤트 기반으로 서비스가 반응적으로 동작하게 구성해봅니다. 이때 분산 메시징 시스템인 Apache Kafka를 다룹니다. 마지막 주차 미션은 조금 무거우니, 끝까지 집중!

[5주차 온라인 세션] 2/4(목) 20:30 ~

###### *온라인 세션이 뭐에요?: 스터디가 100% 온라인에서 진행하기 때문에, 모두가 동시접속해서 커뮤니케이션 하는 시간을 주기적으로 가집니다. 리더가 주차별 미션에 대한 소개를 진행하고, 새로 소개해야 하는 지식에 대한 설명도 진행하며, 스터디원들은 모르는 것에 대한 질문 또는 취업/이직에 대한 질문도 해볼 수 있는 시간입니다. 녹화본이 제공되지만, 실시간성이 중요한 세션이기에 가급적 모두 참여하는걸 권장합니다. 모바일로도 접속 가능합니다.