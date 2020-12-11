const password = document.getElementById("exampleInputPassword");
const confirmPassword = document.getElementById("confirmInputPassword");
const errorMessage = document.getElementById("error");
const confirmPasswordErrorMessage = document.getElementById("cerror");
const form = document.getElementById("form");
const input = document.getElementsByTagName("input")

form.addEventListener('input', ev => {
    let passwordMessages = [];
    let confirmPasswordMessages = [];

    if (password.value.length < 7) {
        passwordMessages.push('Za krótkie hasło. Min. 8.');
    }

    if (!password.value.match(/[A-Z]/)) {
        passwordMessages.push('Min 1 duża litera.');
    }

    if (!password.value.match(/[`!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/)) {
        passwordMessages.push('Min 1 znak specjalny.');
    }

    if (password !== confirmPassword) {
        confirmPasswordMessages.push('Hasła różnią się od siebie!');
    }

    if (passwordMessages.length > 0) {
        ev.preventDefault();
        errorMessage.innerText = passwordMessages.join('\n');
    }

    if (confirmPasswordMessages.length > 0) {
        ev.preventDefault();
        confirmPasswordErrorMessage.innerText = confirmPasswordMessages.join("\n");
    }
});