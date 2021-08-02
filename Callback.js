console.log("Marcel's Custom Callback Function")

function processThis(message, callback) {
  console.log("Let me introduce myself " + message);

  if (typeof callback == "function")
      callback();
}

processThis("Hello My name is Marcel", function callFunction() {
  console.log("And this is my first callback function")
});