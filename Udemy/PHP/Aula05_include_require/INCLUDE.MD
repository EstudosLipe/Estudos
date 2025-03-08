# INCLUDE

Serve para incluir conteúdo dentro de um arquivo PHP

- Sintax:
```
    include "arquivo.ext";
```

# INCLUDE_ONCE

Funciona exatamente igual o ***INCLUDE*** porém, impede que o mesmo arquivo seja requisitado mais de um vez. Isto garante que caso eu tenha varios include em diferente arquivos, ele só executará um

- Sintax:
```
    include_once "arquivo.ext";
```