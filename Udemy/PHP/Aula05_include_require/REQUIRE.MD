# REQUIRE

Serve para incluir conteúdo dentro de um arquivo PHP. O Require gera um ***ERROR_FATAL*** caso o arquivo não exista ou apresenta falhas, fazendo o Script ser encerrado.

- Sintax:
```
    require "arquivo.ext";
```

# REQUIRE_ONCE

Funciona exatamente igual o ***REQUIRE*** porém, impede que o mesmo arquivo seja requisitado mais de um vez. Isto garante que caso eu tenha varios include em diferente arquivos, ele só executará um

- Sintax:
```
    require_once "arquivo.ext";
```