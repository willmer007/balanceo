const http = require('http');
const server = http.createServer((req, res) => {
  res.end('Hola desde Node.js - ' + require('os').hostname());
});
server.listen(3000);