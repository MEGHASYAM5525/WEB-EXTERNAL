function validateForm() {
    var email = document.getElementById("email").value;
    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  
    if (email.trim() === "" || !emailPattern.test(email)) {
      alert("Please enter a valid email address.");
      return false;
    }
  
    // Simulate successful unregistration by showing an alert
    alert("Successfully unregistered!");
  
    return true;
}
