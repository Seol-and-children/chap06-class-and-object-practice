# 프로젝트 소개
- 요리사가 빵을 굽는 프로그램

# 시스템 요구사항
1. 요리사는 빵 넣고 오븐 켜기, 온도 설정하기, 온도 올리기, 가만히 있기, 온도 내리기, 빵 꺼내고 오븐 끄기를 할 수 있다.
2. 빵은 요리 시작, 구워지기, 요리 끝을 할 수 있다.
3. 빵은 처음에 0% 만큼 조리된 상태로 대기한다.
4. 요리사는 오븐을 킨다. 이미 켜져 있으면 킬 수 없다.
5. 요리사는 오븐의 초기 온도를 설정 해야한다.
5. 요리사가 온도를 올리면 온도는 10ºC 만큼 올라간다.
6. 요리사가 온도를 내리면 온도는 10ºC 만큼 내려간다.
7. 빵은 요리사의 {온도 올리기, 내리기, 가만있기} 명령 한번에 (온도/20)% 만큼 구워진다.
8. 요리사는 1분마다 하나의 행동을 한다.
9. 요리사가 빵을 꺼내고 오븐을 끄면 빵이 110% 이상 구워지면 탔음, 100 ~ 110%면 맛있게 구워짐, 100% 미만이면 덜익음을 출력하고 빵을 꺼냄