# 📖 DAILY JOURNAL APP

This is a Java-based Android application developed in Android Studio using XML and Java.  
It is a simple diary/journal app that allows users to write, save, and view entries during the app session.  

---

## ✨ Features
- **Login Page**: Basic login with a predefined username and password.

 <img width="427" height="886" alt="login" src="https://github.com/user-attachments/assets/22a9b933-abc4-4609-8639-34ca4b12e1ff" />

- **Home Page**: Displays saved diary entries with titles, text, and an image.

 <img width="427" height="886" alt="home" src="https://github.com/user-attachments/assets/2a95918f-73cf-4da0-806e-318dd35aa6a8" />

- **Add Entry**:

<img width="427" height="886" alt="add entry" src="https://github.com/user-attachments/assets/dce4f188-a785-4708-ba96-a6cbfc1bdd41" />

- **Save Functionality**: Saves the entry temporarily and returns to the home page.

<img width="427" height="886" alt="image" src="https://github.com/user-attachments/assets/9be7a645-0831-4e14-ba27-8de11b3474e2" />


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
3. Click Add your data here button → Navigate to Add Entry Page.  
4. Enter title, text, and choose an image → Save entry.  
5. Entry is added to the Home Page list.  
6. Close the app → All data is erased (session-only storage).  

---

## ✨ Features of the Applcation Temporary Storage Only
- **Predefined Image Gallery** using a custom spinner (image + text).  
- **Automatic Entry Display** — saved entries instantly appear on the Home Page.  
- **Session-Based Storage** with SharedPreferences (data erased when the app is closed).  
- **Simple & Minimal UI** designed with XML layouts.  
- **Basic Validation** — ensures title and text are not empty before saving.  
---

## 📌 Future Improvements
- Add persistent storage with SQLite or Room database.  
- Enable editing and deleting entries.  
- Improve UI with Material Design components.  
- Add cloud sync for backup.  

---

👩‍💻 **Developed by:** B GamyaSri (CSE)  
📚 Project: Mobile Application Development (Daily Journal App)
