# 📚 Library Management System (Java)

A simple console-based Library System written in Java. It allows users to:
- View all books
- Add new books
- Store data in a text file (`books.txt`)

## 🗂️ Project Structure

```
project-root/
├── bin/                     # Compiled class files
├── database/
│   └── books.txt            # Book data storage
├── src/
│   ├── Book.java            # Book class (create/save book)
│   ├── Bookshelf.java       # Handles reading book list
│   └── Library.java         # Main system controller
├── build.bat                # Build script for Windows
├── build.sh                 # Build script for macOS/Linux
└── .gitignore               # Optional: excludes compiled files
```

## 🚀 How to Run

### 1. Compile the code
You can use the provided scripts or run manually.

**On macOS/Linux:**
```bash
chmod +x build.sh
./build.sh
```

**On Windows:**
```cmd
build.bat
```

### 2. Run the program
After compiling, run the main class:

```bash
java -cp bin Library
```

> Make sure you're in the project root directory and that the `bin/` folder exists.

## 📦 Features

- 📖 View all books from `books.txt`
- ➕ Add a new book (title and author)
- 📝 Persistent storage in `database/books.txt`

## 🛠️ Requirements

- Java 8 or higher
- Command line (terminal or command prompt)

## ✅ Example

```
Welcome to the Library System!
Supported Commands:
1 - getBooks
2 - addBook
Select a command (1, 2...):
```

## 📁 Notes

- Make sure `database/books.txt` exists before running.
- You can edit the `.gitignore` file to exclude `bin/` or `books.txt` if needed.

## 📄 License

This project is open source and free to use for educational purposes.
