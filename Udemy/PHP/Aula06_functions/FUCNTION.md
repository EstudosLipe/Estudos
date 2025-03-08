# FUNCTIONS
- São blocos de codigos que possuem nomes.
- Essas funções realizam um ação e podem ser chamadas novamente ao longo do codigo. Evitando duupliciade e repetição de codigos além de melhorar a manutenção da sua aplicação.
- São passados parametros dentro dessa função que moldam a sua execução.
- O PHP possui diversas funções nativas da linguagem que facilita no seu desenvolvimento

### Sintax
- NameFunction() = definição de uma nova função
- $param = parametros da função
```
    function NameFunction($param){
        //todo
    }
```

### Return
- Functions servem para retornar algo que será utilizado posteriormente, e par aisso utilizamos a instrução ***return***:
```
    function NameFunction($param){
        //todo

        return $value
    }
```
### Escopo de functions
- Cada function possui o seu escopo chamado de ***local***;
- Dentro deste local cada variavei ou instrução passada é unica e exlusiva desta function;
- Podemos utilizar valores fora do escopo (variaveis globais) dentro da function utilizando ***global $var***
- O ***static*** serve para armazenar os valores retornados em uma function
```
    $var = "Teste";

    function NameFunction(){
        global $var;

        //todo;
    }
```
### Parametros Default
- Podemos passar valores defaults aos parametros, que caso não seja passando nenhum outro valor para ele, é assumido este valor default
- Boa Prática: Inserir parametros defaults por ultimo
```
    function NameFunction($var = "default_value"){
         //todo;
    }
```

### Invocar uma função
- Para chamar (invocar) uma função, basta colocar o nome da função seguido de parenteses, caso precise passe os paramentro dentro dos parenteses:
```
    NameFunction($param);
```