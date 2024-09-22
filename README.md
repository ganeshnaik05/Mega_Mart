# Mega_Mart

I am working on craeting appliaction called Mega Mart.Below are my requirements

Problem Statement:

Megamart is an online application created using Spring Boot which needs to have the following functionalities:

1. Register

2. Login

3. Search Product

4. Add to cart

5. Wish list

6. Order

7. Checkout

Create following table on database 

Account table:

Column Name          Data Type
-----------         -----------
Name              varchar(15) (Primary Key)

Password          varchar(15)

Confirm Password  varchar(15)

Email             varchar(15)
 
Product table:

Column Name          Data Type
-----------         -----------
Product_Id         varchar(5) (Primary Key)

Product_Name       varchar(50)

Description        varchar(200)

Price              Double

Discount           Double

Delivery_Charges   Double

Avg_Rating         Int

Seller_Name        varchar(15)
 
 Cart table:

Column Name          Data Type
-----------         -----------

Cart_Id            varchar(5) (Primary Key)

Product_Name       varchar(50)

Seller_Name        varchar(15)

Quantity           Int

CartOffer_Price    Double

Order table:

Column Name          Data Type
-----------         -----------

Order_Id           varchar(5) (Primary Key)

Display_Name       varchar(50)

Category           varchar(20)

Seller_Name        varchar(15)

Price              Double

Quantity           Int

Total_Price        Double

Ordered_Date       Date

Order_Status       varchar(10)

Wish List table:

Column Name          Data Type
-----------         -----------

Wish_Id             varchar(5) (Primary Key)

Display_Name        varchar(50)

Short_Desc          varchar(50)

Category            varchar(20)
 
 Project Implementation:

Implement an online application using Spring Boot to support the following operations

Register Module:

1. The new user should be able to register and valid data should be persisted into the Account table

2. Validate the new user with the below criteria

Error messages:

All the fields are mandatory

If Email-id is already used

Name contains invalid character

Password should contain at least an uppercase and a lowercase character, a number and a special character

Password and Confirm Password are not matching
 Login Module:

1. If the user is already registered, username and password should be checked with the Account table

2. Validate the logged-in user with the below criteria

Error messages:

* All the fields are mandatory

* Invalid username and password

Search Product Module:

We assume that the product table data is entered from the back end and kept ready with the product details

1. Enter valid product details into the product table

2. Use a drop-down list to show the list of products for user selection

3. While displaying each product, display the following details to the user

* Display price, description, seller name, average rating, discount, and delivery charges

4. Verify that an error message is displayed when no product is found

* Verify that buyer is able to see all the products starting with the text he/she typed

* Verify that the extra discount is applicable on the product and effective price showed to the user on the product page as well as in his/her cart

* Verify that the correct product details are shown to the buyer along with all the detailed information
Verify that price quotes are shown for the same product from all the sellers who sell that item

Add to Cart Module:

1. The user on clicking the add to cart button should be able to add the chosen items to the cart

2. Validate the following

1. Verify that items in the cart are kept when the buyer logs in

2. Verify those cart items are retained even if the browser is closed

3. Verify that the total amount of the cart is shown along with a checkout button

4. Verify that item name, quantity, price, discount, delivery charge, cart offered by the seller for each item in the cart is shown

5. Verify that when the cart item quantity is changed or the item is deleted the total amount and delivery charge should change accordingly

6. Verify that max quantity is still within max limit

7. Verify that if the same product is added again then the cart should have that item only once when a new quantity is added to the already existing quantity

8. Verify that some predefined list of quantity is provided to choose from

Wish List Module:

1. The registered user should be able to add any product from the product details page to the wish list so that the user can locate the product easily while buying at a later time

2. Registered users should be able to delete the products in his/her wish list
3. Validate the following

* Verify that only registered buyers can add products to their wish list

* Verify that only registered buyers can view/modify only their wish list

Order Module:

1. Users should be able to place an order

2. Returning a product should be within 10 days

3. Ordered products should match the items in the cart

4. Validate the following

* Verify that only registered user can see his/her orders

* Verify that buyer can see all his orders and he can filter open orders, delivered orders, returned orders, and canceled orders also

* Verify that cancel order is possible only for open orders and by the registered user

* Verify that return order is possible only for delivered orders and by the registered user

* Verify that only registered buyers are allowed to send rating and feedback to seller from the orders page

* Verify that only registered buyer can rate on a scale of 1 to 5 and review a product
Check Out Module:

1. The registered user should be able to purchase the items by checking out by providing a shipping address and payment method

2. The registered user should be able to place the order and get the order id after successful payment to keep track of the order placed

3. Validate the following

* On checking out a card buyer is asked for a shipping address and payment details

* Registered buyer can choose from existing shipping addresses or create a new one

* Registered buyer can choose from existing payment method where only CVV has to be given, or they can add new card details or can choose COD

* An error message is shown if the card selected has expired

* Verify that when payment is successful, the new order id is generated and shown to the buyer for further reference

Common functional requirements:

* Error messages should be logged in an external file

* All the modules should be unit tested

* Product details should be exposed as REST API

* The application should be protected from unauthorized access

