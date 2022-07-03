# BankServises
## 1.Предварительно реализовано 2 сервиса -, 2- клиентский

* ** 1-[ для сотрудника банка ](https://github.com/UBCh/BankServises/blob/7cdd04ad20d1176f6fb1a3d4c4d7ff3fc2a1e39e/src/main/java/servises/Bank.java#L1)**
* ** 2-[ для клиента ](https://github.com/UBCh/BankServises/blob/7cdd04ad20d1176f6fb1a3d4c4d7ff3fc2a1e39e/src/main/java/servises/AccountServis.java#L1)**


## 2. Сервисы независимы друг от друга , хранение данных в разных Мар, общность данных обеспечивается ID  клиента. 

* **[ база данных банка ](https://github.com/UBCh/BankServises/blob/7cdd04ad20d1176f6fb1a3d4c4d7ff3fc2a1e39e/src/main/java/dataClasses/BD/DataBD.java#L1)**
* **[ база данных клинтских аккаунтов ](https://github.com/UBCh/BankServises/blob/7cdd04ad20d1176f6fb1a3d4c4d7ff3fc2a1e39e/src/main/java/dataClasses/BD/BasaAccaunt.java#L1)**

## 3.функционал банковского сервиса : добавление нового клиента, вывод данных всех клиентов, поиск клиента (по имени, фамилии, id), перевод средств между картами клиентов банка.
## 4.функционал клиентского сервиса : создание нового акаунта, с добавлением в банковскую базу нового пользователя со всеми атрибутами, вход в уже существующий акаунт, по логину-паролю, вывод данных акаунта в консоль. 
