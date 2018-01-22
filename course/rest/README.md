# .http를 사용해 Postman 대체하기

프로젝트를 계속 운영하다보면, 로컬 환경외에 개발/운영 환경에서 API 요청이 잘되는지 확인이 필요할때가 많습니다.  
  
* 베타 서버의 A API 값이 안나와요
* 베타 서버의 B API 사용해보려면 어떻게 해야 하나요?

특히 인증 토큰등을 사용하는 경우엔 HTTP Header에 인증토큰을 추가하는 등의 

물론 [Swagger](http://jojoldu.tistory.com/31)와 같은 API 프레임워크를 사용할수 있겠지만, 팀내에서 사용하려면 아무래도 이런 저런 사정으로 프로젝트에 적용하기가 힘들때가 많습니다.  


## 소개

## 장점

### IntelliJ 기능 지원

IntelliJ에서 작성하기 때문에 아래의 기능들이 모두 지원됩니다.

* Code highlighting
* 메서드 형식 및 헤더 필드에 대한 코드 자동 완성
* Viewing structure of HTTP requests
* Request Body에 쓸 JSON 등 적극적 지원 (Language injections)
* 리팩토링


## 참고

* [REST Client in IntelliJ IDEA Code Editor](https://www.jetbrains.com/help/idea/rest-client-in-intellij-idea-code-editor.html)