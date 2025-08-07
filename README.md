# 📚 Library Management System (Java)

A simple console-based Library System written in Java. It allows users to:
- View all books
- Add new books
- Store data in a text file (`books.txt`)

Features to be added:
- Delete books
- Search for a book
- Mark books as borrowed

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
├── build.bat                # Build and run script for Windows
├── build.sh                 # Build and run script for macOS/Linux
└── .gitignore               # Optional: excludes compiled files
```

## 🚀 How to Run

### Option 1: Using Provided Scripts

**On macOS/Linux:**
```bash
chmod +x build.sh
./build.sh
```

**On Windows:**
```cmd
build.bat
```

These scripts will:
1. Compile all Java files in `src/` into `bin/`
2. Run the `Library` class from the compiled files

### Option 2: Manual Run

If you prefer to compile and run manually:

```bash
javac -d bin src/*.java
java -cp bin Library
```

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
