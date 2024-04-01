function validateForm() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;
    if (username.length < 6) {
      alert("Username must be at least six characters long!");
      return false;
    }
    if (password.length < 8) {
      alert("Password must be at least eight characters long!");
      return false;
    } else {
      alert("Successfully Submitted");
      return true;
    }
  }
  