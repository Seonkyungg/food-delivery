![image](https://user-images.githubusercontent.com/487999/79708354-29074a80-82fa-11ea-80df-0db3962fb453.png)

# 과제
# Event Storming

![image](https://user-images.githubusercontent.com/88140439/212680957-b5a1d547-8df0-4531-8b06-2e36c42d9867.png)


# 구현
# 1. saga

![image](https://user-images.githubusercontent.com/88140439/212681482-ef1e008a-153f-46f7-919c-b5ebedaaa7b7.png)
![image](https://user-images.githubusercontent.com/88140439/212681501-519e18e1-a092-4ad1-a376-1533cbc56165.png)


# 2. CQRS

![image](https://user-images.githubusercontent.com/88140439/212681747-d34db787-2080-4489-812a-272b61919ef1.png)
![image](https://user-images.githubusercontent.com/88140439/212681760-8c59a680-2370-44bd-bfe3-5c968fe1956c.png)



# 3. Compensation / Correlation 

주문을 취소하는 이벤트를 발행 하고, 해당 주문량에 대해 다시 원복하는 Compensation을 수행한다. 

![image](https://user-images.githubusercontent.com/88140439/212681972-213708c9-e89e-448f-a7b6-4d1b359b931f.png)

