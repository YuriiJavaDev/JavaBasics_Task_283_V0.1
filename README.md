# Developer Utilities: Generic Methods (JavaBasics_Task_283_V0.1)

## 📖 Description
In large-scale systems, utility classes often provide helper functions that must remain agnostic of the data types they process. This project demonstrates **Generic Static Methods**. By declaring the type parameter `<T>` before the return type of a method, we enable the `printTwice` function to accept any reference type. This approach eliminates the need for method overloading (writing separate versions for `String`, `Integer`, etc.), significantly reducing code duplication and adhering to the **DRY (Don't Repeat Yourself)** principle.

## 📋 Requirements Compliance
- **Generic Method Declaration**: Implemented `<T>` at the method level for maximum flexibility.
- **Static Context**: Created an independent utility class `DevUtils` for stateless operations.
- **Polymorphic Execution**: Proven that the same method handles both `String` and `Integer` seamlessly.
- **Clean Architecture**: Strictly separated the utility logic from the `UtilLauncherApp` entry point.

## 🚀 Architectural Stack
- Java 8+ (Generic Methods, Static Scope, Polymorphism)

## 🏗️ Implementation Details
- **DevUtils**: A static nested utility class providing generic functionality.
- **UtilLauncherApp**: The bootstrap class for testing the utility methods.

## 📋 Expected result
```text
Java
Java
100
100
```

## 💻 Code Example

Project Structure:

    JavaBasics_Task_283/
    ├── src/
    │   └── com/yurii/pavlenko/
    │                 ├── DevUtils.java
    │                 └── UtilLauncherApp.java
    └── README.md

Code
```java
package com.yurii.pavlenko;

public class UtilLauncherApp {

    public static void main(String[] args) {
        DevUtils.printTwice("Java");
        DevUtils.printTwice(100);
    }
}
```
```java
package com.yurii.pavlenko;

public class DevUtils {

    public static <T> void printTwice(T item) {
        System.out.println(item);
        System.out.println(item);
    }
}
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)