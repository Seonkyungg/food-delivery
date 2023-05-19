
# 과제
## 1. Event Storming Model

![image](https://user-images.githubusercontent.com/88140439/212680957-b5a1d547-8df0-4531-8b06-2e36c42d9867.png)



## 2. Saga(pub/sub)확인

![image](https://user-images.githubusercontent.com/88140439/212681482-ef1e008a-153f-46f7-919c-b5ebedaaa7b7.png)
![image](https://user-images.githubusercontent.com/88140439/212681501-519e18e1-a092-4ad1-a376-1533cbc56165.png)


8081주문 서비스를 호출하고 해당 정보를 kafka에 publish 하고 8083주문관리서비스에서 주문서비스에서 publish한 이벤트를 subscribe하여 가져옴.




### CQRS

![image](https://user-images.githubusercontent.com/88140439/212681747-d34db787-2080-4489-812a-272b61919ef1.png)
![image](https://user-images.githubusercontent.com/88140439/212681760-8c59a680-2370-44bd-bfe3-5c968fe1956c.png)

8081주문서비스를 종료하여도 데이터가 저장된 8083주문관리 서비스에는 영향이 없음.


### Compensation / Correlation 

![image](https://user-images.githubusercontent.com/88140439/212681972-213708c9-e89e-448f-a7b6-4d1b359b931f.png)

주문을 취소하는 이벤트를 발행 하고, 해당 주문량에 대해 다시 원복하는 Compensation을 수행한다. 



## 3. Service Router
  ![image](https://user-images.githubusercontent.com/13827032/219187909-85cafabb-5102-430c-b357-2d661280592e.png)

 #### 서비스 목록
 ![image](https://user-images.githubusercontent.com/13827032/219188072-59bc89a7-e609-41cd-afe1-e9d43c1a03eb.png)



## 4. Zero downtime Deployment
  
![image](https://github.com/Seonkyungg/food-delivery/assets/88140439/cc9c5275-c58c-4559-916f-94c8bd71abf7)

readinessProbe 설정



 #### 부하 발생 전
  ![image](https://user-images.githubusercontent.com/13827032/219223756-a296c0c7-9afc-4171-9ae2-8d45dff99fa1.png)
 #### 부하 발생 후
  ![image](https://user-images.githubusercontent.com/13827032/219224311-38fb7b9f-0604-4040-8f4c-cad8d96feb5c.png)
 #### pod 증가
  ![image](https://user-images.githubusercontent.com/13827032/219224443-a01133cd-ad27-4441-aaab-18e25acf84fa.png)






