# OBJETOS EM PHP

- PHP possui o paradigma de **Orientação a Objetos**
- Objetos são oriundo de um instanciação de uma classe (molde)
- Os objetos são dividos em metodos (Suas ações (Funcions)) e propriedades (Variveis visiveis ao escopo)

### Criar um Obj e suas Caracteristicas
- *NameClass* = nome da classe (recomenda-se utilizar o memso nome do arquivo)
- *Private* = só pode ser utilizada dentro da classe
- *Public* = pode ser acessada por outros objetos
- *NameMethodo* = nome do metodo
```
    class NameClass{
        private $propriedade;

        public function NameMethod(){
            //todo
         }
    } 

```
- Utilizar a tag ***new*** para instanciar um OBJ:
```
    $obj = new NameClass;
```

- Para acessar suas propriedades e metodos utiliza-se a arrow ***->*** nesse obj instanciado
```
    $obj->NameMethod();
```