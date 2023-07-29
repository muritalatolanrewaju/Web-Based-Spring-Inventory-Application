# Web-Based Spring Inventory Application

Welcome to the GitHub repository of my project, the Web-Based Spring Inventory Application. This application is designed to assist in managing inventory for a customer who sells products composed of parts. This sample use case focuses on a computer store's customer, selling computers as products and components like CPUs, RAMs, and Hard drives as parts.

## Features

- **Customizable HTML User Interface**: The application includes an HTML user interface that can be customized to display the shop name, the names of the products, and the names of the parts.
- **About Page**: The application features an "About" page that provides information about the customer's company. This page is accessible from the main screen and vice versa.
- **Sample Inventory**: The application has a sample inventory suitable for a computer store. It includes five parts and five products.
- **Buy Now Button**: The product list has a "Buy Now" button. On clicking this button, the inventory of the product decreases by one.
- **Maximum and Minimum Inventory Tracking**: he application tracks each part's maximum and minimum inventory.
- **Inventory Validation**: The application validates that the inventory of each part and product is within the maximum and minimum limits.
- **Unit Tests**: The application includes unit tests for the maximum and minimum inventory fields.

## Setup and Installation

**Prerequisite**: To run this application, you must install Java and Spring Framework on your computer.

1. **Clone the repository**: Use the `git clone <repository-url>` command to clone this repository to your local machine.
2. **Navigate to the cloned directory**: Use `cd <directory>` command to navigate to the cloned directory.
3. **Run the application**: Use the `mvn spring-boot:run` command to run the application.

## Usage

After setting up the application, you can start using it to manage the inventory for your computer store.

1. **Load the User Interface**: Open your web browser and navigate to `http://localhost:8080` to load the user interface.
2. **View and Update Inventory**: The inventory of parts and products is displayed on the main page. You can add, update, or delete parts and products.
3. **Purchase Products**: Click the "Buy Now" button next to the product to purchase a product. This will decrement the product's inventory by one.
4. **View About Page**: To view the "About" page, click the "About" link in the navigation menu.

## Contribution

Please submit a pull request if you would like to contribute to this project.

## License

This project is licensed under GNU General Public License v3.0.
