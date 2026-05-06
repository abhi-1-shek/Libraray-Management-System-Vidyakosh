📚 Library Management System(Vidyakosh)


We developed Vidyakosh, a modern React-based library management system. It features a high-performance Glassmorphism interface with a Grid Card layout for archive browsing. Key functionalities include real-time search, smooth state-driven record editing, and a robust CRUD architecture for managing volumes—all finalized with a professional rights-reserved footer.


🚀 Features

     *Dynamic CRUD Operations: Seamlessly create, read, update, and delete book records without page reloads.
     
     *Smart Search Engine: A real-time filter that indexes the collection by title, author, or ISBN as you type.

     *State-Driven Persistence: Uses React hooks (useState, useMemo, useCallback) to manage the library state efficiently and prevent unnecessary re-renders.

     *Responsive Archive Grid: A flexible layout that adapts from a detailed table on desktops to organized cards on mobile devices.
   

🏗️ Tech Stack

* Frontend

       * React.js
       * Axios (API calls)
       * Bootstrap

* Backend

      * Spring Boot
      * Spring Data JPA
      * Hibernate
      * REST APIs

* Database

      * MySQL / PostgreSQL (configurable)

📂 Project Structure

           library-management-system/
           │
           ├── lms frontend/              # React app
           │   ├── src/
           │   └── package.json
           │
           ├── lms backend/              # Spring Boot app
           │   ├── src/main/java/
           │   ├── src/main/resources/
           │   └── pom.xml
           │
           └── README.md
⚙️ Setup Instructions

     🔹 Backend (Spring Boot)
         1.Navigate to backend folder:
         
             cd lms backend  

             
         2. Configure database in application.properties:
         
             spring.datasource.url=jdbc:mysql://localhost:3306/library_db
             spring.datasource.username=root
             spring.datasource.password=yourpassword
             spring.jpa.hibernate.ddl-auto=update
             
         3.Run the application:
         
             mvn spring-boot:run
 Backend will start at:
👉 http://localhost:8080 


🔹 Frontend (React)

    1. Navigate to frontend folder:
    
        cd lms frontend
        
    2.Install dependencies:
    
       npm install

    3.Start the React app:
    
       npm start or npm run dev

Frontend will run at:
👉 http://localhost:5173




| Method | Endpoint        | Description    |
| ------ | --------------- | -------------- |
| GET    | /api/books      | Get all books  |
| POST   | /api/books      | Add a new book |
| PUT    | /api/books/{id} | Update book    |
| DELETE | /api/books/{id} | Delete book    |
| POST   | /api/issue      | Issue a book   |
| POST   | /api/return     | Return a book  |


🧪 Future Enhancements

     * JWT Authentication & Role-based access
     * Email notifications for due dates
     * Fine calculation system
     * Admin dashboard analytics
             
                    
