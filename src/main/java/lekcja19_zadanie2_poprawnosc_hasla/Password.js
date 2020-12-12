const password = document.getElementById("exampleInputPassword");
const confirmPassword = document.getElementById("confirmInputPassword");
const errorMessage = document.getElementById("error");
const confirmPasswordErrorMessage = document.getElementById("cerror");
const form = document.getElementById("form");

form.addEventListener('keyup', ev => {
    let passwordMessages = [];
    let confirmPasswordMessages = [];

    if (password.value.length < 8) {
        passwordMessages.push('Za krótkie hasło. Min. 8.');
    }

    if (!password.value.match(/[A-Z]/)) {
        passwordMessages.push('Min 1 duża litera.');
    }

    if (!password.value.match(/[`!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/)) {
        passwordMessages.push('Min 1 znak specjalny.');
    }

    if (confirmPassword.value !== password.value) {
        confirmPasswordMessages.push('Hasła różnią się od siebie!');
    }

    if (passwordMessages.length > 0) {
        ev.preventDefault();
        errorMessage.innerText = passwordMessages.join('\n');
    } else {
        errorMessage.remove();
    }

    if (confirmPasswordMessages.length > 0) {
        ev.preventDefault();
        confirmPasswordErrorMessage.innerText = confirmPasswordMessages.join("\n");
    } else {
        confirmPasswordErrorMessage.remove();
    }
});

