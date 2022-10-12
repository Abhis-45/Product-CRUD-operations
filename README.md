# Product-CRUD-operations
crud operations done using java, spring boot and MySQL . 

install eclips ide and mysql server to run this program.

after that use cmd to get output.

use following command in cmd:-

show data-

curl http://localhost:8080/products/id       {ex- id=1001}

insert data- 

curl -X POST -H "Content-Type: application/json" -d "{\"id\":1006,\"name\":\"oneplus\",\"type\":\"Mobile\",\"category\":\"Electronics\",\"price\":30000,\"discount\":15,\"gst\":18,\"deliverycharge\":350}" http://localhost:8080/products

update data-

curl -X PUT -H "Content-Type: application/json" -d "{\"name\":\"oneplus 7 pro\",\"price\":3100}" http://localhost:8080/products/id	{ex- id=1001}

delete data-

curl -X DELETE http://localhost:8080/products/id	{ex- id=1001}
