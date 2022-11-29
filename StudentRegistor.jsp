<h1>Registration Form</h1>
<form action="/StudentSave" method="post">
    <table>
        <td>
    StudentId:<input type="text" name="sid"><p></p>
    </td>
    <td>
    StudentName:<input type="text" name="name"><p></p>
    </td>
    <td>
    SubjectName:<select name="subjects" >
        <option value="English">English</option>
        <option value="Maths">Maths</option>
        <option value="Science">Science</option>
    </td>
    <td>
    Marks:<input type="text" name="marks"><p></p>
    </td>
    <td>
    Semester:<select name="semester" >
        <option value="1st">1st</option>
        <option value="2nd">2nd</option>
    </td>
    <td>
    <input type="submit" value="Save">
    </td>
</table>
</form>