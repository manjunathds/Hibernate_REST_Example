<html>
<body>
<h4>Add Employee Detais</h4>

<div>
<form action="rest/empAPI/add" method="POST">

<label>Employee ID</label>
<input type="text" name="empId" id="empId" />
<br>

<label>Employee FirstName</label>
<input type="text" name="empFirstName" id="empFirstName" />
<br>

<label>Employee LastName</label>
<input type="text" name="empLastName" id="empLastName" />
<br>

<br><label>Employee Department</label>
<input type="text" name="empDept" id="empDept" />
<br>

<label>Employee Group</label>
<input type="text" name="empGroup" id="empGroup" />
<br>

<label>Employee Type</label>
<input type="text" name="empType" id="empTpe" />
<br>

<label>Employee CTC</label>
<input type="text" name="empCtc" id="empCtc" />
<br>

<label>Employee PF Amount</label>
<input type="text" name="empPfAmt" id="empPfAmt" />
<br>

<label>Employee Tax Amount</label>
<input type="text" name="empTaxAmt" id="empTaxAmt" />
<br>


<input type="submit" value="Add Employee" />
</form>

</div>



</body>
</html>
