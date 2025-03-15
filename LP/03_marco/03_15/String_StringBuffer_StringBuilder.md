# STRING
 Strings são objetos imutaveis ou seja, após a declaração de um valor a um objeto do tipo string não é possivel manipular este valor e manter o conteudo orignal. Sempre que você fazer esta alteração cria-se um novo objeto.
 Por conta disto a utilização da classe String torna-se eficiente quando queremos criar constantes para o nosso codigo. Caso o contrario, a execução do códico se torna lenta como pode ver, executando o codigo abaixo:
 ```java
    public static void main(String args[]){

        int i=0;
        String grito = "";

        for(i=0;i<650000; i++){
            grito += 'a';
        }
        System.out.print(grito);
    }
 ``` 
 Devido isto, existem outra classe que melhoram a manipulação de string, sãoelas _`StringBuilder`_ e _`StringBuffer`_
# STRINGBUILDER
