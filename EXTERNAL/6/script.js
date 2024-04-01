function validateForm() {
    const username = document.getElementById("username").value;
    const email = document.getElementById("email").value;
    
    // Username validation
    if (username.length < 6) {
      alert("Username must be at least six characters long!");
      return false;
    }
  
    // Email validation
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
      alert("Invalid email address!");
      return false;
    }
  
    // If all validations pass
    alert("Successfully Registered!");
    return true;
  }
  