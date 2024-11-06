// Função de autenticação básica (com problemas de segurança e código duplicado)
function authenticate(user, password) {
    if (user === "admin" && password === "admin123") {
        console.log("Autenticação bem-sucedida");
        return true;
    } else if (user === "guest" && password === "guest123") {
        console.log("Autenticação bem-sucedida");
        return true;
    } else {
        console.log("Autenticação falhou");
        return false;
    }
}

// Função de verificação de permissões (com alta complexidade ciclomática)
function checkPermissions(userRole) {
    if (userRole === "admin") {
        console.log("Permissão completa concedida.");
    } else if (userRole === "moderator") {
        console.log("Permissão de moderação concedida.");
    } else if (userRole === "user") {
        console.log("Permissão de usuário concedida.");
    } else if (userRole === "guest") {
        console.log("Permissão limitada concedida.");
    } else {
        console.log("Permissão negada.");
    }
}

// Código duplicado na verificação de autenticação para outras funções
function loginAsAdmin() {
    return authenticate("admin", "admin123");
}

function loginAsGuest() {
    return authenticate("guest", "guest123");
}

// Uso inseguro de dados sensíveis no console
console.log("Senha do administrador: admin123");
