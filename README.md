
# Shopping Cart Calculation System

This project implements a shopping cart system for an online store that sells three types of products: high-end phones, mid-range phones, and laptops. It supports two types of clients: individual customers and professional clients. Depending on the client's type and annual revenue, product prices may vary.

The system uses **BigDecimal** to ensure accurate financial calculations, following the principles of **SOLID** design and **TDD (Test Driven Development)**.

## Features

- **Two client types**:
    - **Individual clients**: Identified by their ID, first name, and last name.
    - **Professional clients**: Identified by their ID, business name, optional VAT number, SIREN, and annual revenue.

- **Products**:
    - High-end phone
    - Mid-range phone
    - Laptop

- **Price Calculation**:
    - Individual clients:
        - High-end phone: 1500 €
        - Mid-range phone: 800 €
        - Laptop: 1200 €
    - Professional clients with revenue > 10M €:
        - High-end phone: 1000 €
        - Mid-range phone: 550 €
        - Laptop: 900 €
    - Professional clients with revenue ≤ 10M €:
        - High-end phone: 1150 €
        - Mid-range phone: 600 €
        - Laptop: 1000 €

- **Cart Calculation**:
    - Supports the calculation of total prices based on the quantity of products in the cart for a given client.
    - Uses **BigDecimal** for precise financial calculations.

## Getting Started

### Prerequisites

- **Java 8** or higher
- **JUnit 5** for unit testing

### Usage

The system allows you to create a cart for either an individual or a professional client, add products with specific quantities, and calculate the total price. Here is an example usage in code:


### Testing

The project is built with **TDD (Test-Driven Development)** principles. All unit tests are located in the `test` folder. To run the tests, use your IDE or command line to execute the following:

```bash
mvn test
```

### Examples of Unit Tests

The unit tests ensure that different types of clients (individual and professional) have their carts calculated correctly based on the quantity of products and applicable pricing rules.
```

## Contributing

Contributions are welcome! If you find any bugs or want to add new features, feel free to create a pull request or open an issue.

## License


---

By following the principles of **SOLID** and **TDD**, this project ensures that the system is modular, extensible, and easy to maintain.