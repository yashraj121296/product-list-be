

## Springboot Application to serve as Back End for [product-list react app](https://github.com/yashraj121296/product-list)
### To locally run the application use ```./mvnw spring-boot:run ```  

[Flyway Migration script](https://github.com/yashraj121296/product-list-be/blob/main/src/main/resources/db/migration/V1__Initialize_Db.sql) initialize the DB with following data 

```
[
  {
    "name": "Apple",
    "category": "Fruits",
    "price": 1.0,
    "stocked": true
  },
  {
    "name": "Dragonfruit",
    "category": "Fruits",
    "price": 1.0,
    "stocked": true
  },
  {
    "name": "Passionfruit",
    "category": "Fruits",
    "price": 2.0,
    "stocked": false
  },
  {
    "name": "Spinach",
    "category": "Vegetables",
    "price": 2.0,
    "stocked": true
  },
  {
    "name": "Pumpkin",
    "category": "Vegetables",
    "price": 4.0,
    "stocked": false
  },
  {
    "name": "Peas",
    "category": "Vegetables",
    "price": 1.0,
    "stocked": true
  }
]
```
