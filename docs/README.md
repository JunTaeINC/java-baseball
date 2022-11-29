## 기능 구현 리스트

---
### (ComputerNumber)
- [X] 컴퓨터 랜덤번호 생성하기 ( setComputerNumbers )
  - 1 ~ 9 사이의 숫자
  - 중복 X
  - 세 자리의 숫자
---
### (InputView , UserNumber , Validator)
- [X] 플레이어에게 3자리의 숫자 입력받기
  - [X] 문자를 입력했을경우 예외발생
  - [X] 중복되는 숫자 입력시 예외 발생
  - [X] 1~9 사이의 숫자가 아닐시 예외 발생
  - [X] 숫자 세개를 입력 안할시 예외 발생
---
### (OutputView)
- [ ]  볼 & 스트라이크 & 낫싱 출력해서 결과 보여주기
---
### (InputView , Validator)
- [ ] 3 스트라이크로 정답 맞출시 reStart , endGame 입력받기
  - [ ] 문자입력시 예외발생
  - [ ] 1,2 숫자가 아닐시 예외 발생
  - [ ] reStart 번호 다시 초기화