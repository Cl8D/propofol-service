# propofol-service

- 캡스톤 프로젝트 개발 개인 백업용 레포지토리 😊
- Backend) spring, spring cloud (MSA Service)
  - 세부 기술) Eureka, FeignClient
  - 배포) Jenkins, Docker
- Frontend) React 
- README.md는 계속 수정 예정, 프로젝트 종료 후 각 서비스별로 별도의 문서로 분리할 예정😚
- 📁 Project Repo) https://github.com/1917Years

---

### ✔ Schedule (~ing)
- user-service (0423~)
    - Spring Security + JWT token 활용 + Refresh Token 적용
    - 회원가입, 로그인, 회원 수정, 비밀번호 찾기
    - Oauth2 카카오 로그인 
    - til-service와 통신하여 사용자의 글 정보 얻어오기
    - 스트릭 기능 추가
    - refresh token 인증 및 JWT 재발급 처리 구현
  

- api-gateway (0425~)
    - 사용자의 JWT token 검증 + 인증된 사용자만 service 가능하도록
    - refresh token이 없을 경우 filter 거치지 않도록 수정
    - Preflight 문제 해결을 위해 OPTIONS 허용 메서드 추가


- discovery-server (0425~)
    - 일종의 주소록 역할
    

- config-server (0427~)
  - 설정 정보 프로퍼티 통합 관리 (.yml)
  - 암호화 완료


- til-service (0427~)
  - 게시판 CRUD, 페이징
  - 게시글 수정, 삭제 시 권한 확인 추가 
  - 댓글, 대댓글 CRUD, 페이징
  - 로컬 파일 업로드 구현 (클라이언트 테스트는 아직 X)
  - 제목 검색 기능 임시 추가
  

- ptf-service (0430~)
  - 포트폴리오 조회 및 생성, 삭제, 수정(미완) 완료


- tag-service(0503~)
  - 태그 목록 DB 저장 (Programmers 활용)
  - 태그 CRUD 완성 (CUD의 경우 관리자만 가능하도록)
  - 키워드 검색 구현(슬라이싱)
  

- secret.yml
  - 본 프로젝트에서는 아마존 AWS 사용, AWS RDS 사용