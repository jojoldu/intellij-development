# IntelliJ http Client 응답값 변수로 저장하고 사용하기

```bash
POST http://localhost:300/login
Content-Type: application.json

< ./login.json

> {% client.global.set("token", reponse.body.token); %}
```

```bash
GET http://localhost:8080/notice
Authorization: Bearer {{token}}

```