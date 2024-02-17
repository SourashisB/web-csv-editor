# web-csv-editor
A challenge project to create a front end and a back end for a webapp where users can upload and edit csv files in a excel-like UI

**Tech stack:**
1. Java Spring Boot for backend (you can use Java 17 or higher)
2. NextJS with Typescript for the frontend 
3. Postgres for the database

**Necessary Features:**
NextJs based frontend.
Spring Boot based backend.
Starts a minimal postgres docker image on port 5432

**Description of Screens:**
File Management Interface: This screen presents a neatly organized list of all uploaded CSV files, complete with a user-friendly 'Upload' button. This intuitive feature streamulates the process of adding new files, offering a seamless user experience for managing data uploads.

CSV Editor Workspace: This dedicated screen transforms the experience of editing an uploaded CSV file by providing a spreadsheet-style interface. It's designed for ease of use, mirroring the familiar functionality of leading spreadsheet software. The editor is equipped with a prominent 'Save' button, ensuring that all changes can be securely stored with a simple click.

**User Experience**
1. On startup, the web app displays the main dashboard (Screen 1).
2. Users can upload new CSV files directly on Screen 1, retaining the original file names.
3. Uploaded files appear in a list, each with an 'Edit' button.
4. Selecting 'Edit' opens the CSV in a spreadsheet-like interface (Screen 2).
5. Changes are made on Screen 2 and saved with a 'Save' button.
6. After saving, users are automatically returned to the main dashboard (Screen 1).
