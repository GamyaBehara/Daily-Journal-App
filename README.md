# 📖 Diary App

This is a **Java-based Android application** developed in **Android Studio** using **XML and Java**.  
It is a simple diary/journal app that allows users to write, save, and view entries during the app session.  
⚠️ Note: No database is used — all data is stored temporarily, so entries are lost when the app is closed.

---

## ✨ Features
- **Login Page**: Basic login with a predefined username and password.  
- **Home Page**: Displays saved diary entries with titles, text, and an image.  
- **Add Entry**:
  - Title input  
  - Text area for writing  
  - Image selection using a dropdown (spinner) from predefined images (stored in XML/strings).  
- **Save Functionality**: Saves the entry temporarily and returns to the home page.  
- **Session Only**: Closing the app clears all entries (no database integration).

---

## 🛠️ Tech Stack
- **Language**: Java  
- **IDE**: Android Studio  
- **UI Design**: XML Layouts  
- **Storage**: SharedPreferences (temporary storage)

---

## 📂 Project Structure
- `LoginActivity.java` → Handles user login.  
- `MainActivity.java` → Home page, displays saved entries.  
- `AddEntryActivity.java` → Form to create a new entry.  
- `ImageSpinnerAdapter.java` → Custom adapter for image selection spinner.  
- `res/layout/` → XML layouts for each activity (login, main, add entry, custom spinner).  
- `res/drawable/` → Predefined images for entries.  

---

## 🚀 How It Works
1. Launch the app → Login with predefined credentials (`gamya / 123`).  
2. Home Page → Shows saved entries.  
3. Click **➕ Add Button** → Navigate to Add Entry Page.  
4. Enter title, text, and choose an image → Save entry.  
5. Entry is added to the Home Page list.  
6. Close the app → All data is erased (session-only storage).  

---

## 📸 Screenshots (from project doc)
- Login Page  
- Home Page  
- Add Entry Page  
- Data displayed on Home Page  

---

## 📌 Future Improvements
- Add persistent storage with SQLite or Room database.  
- Enable editing and deleting entries.  
- Improve UI with Material Design components.  
- Add cloud sync for backup.  

---

👩‍💻 **Developed by:** B GamyaSri (CSE)  
📚 Project: Mobile Application Development (Daily Journal App)
