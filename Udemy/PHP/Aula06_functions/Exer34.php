<?php
// Exer35 - Function que imprime se é par ou impar.

function ParImpar($value){
    if($value%2==0){
        echo "Seu número $value é par \n";
    }else{
        echo "Seu número $value é impar \n";
    }
}

ParImpar(13);
ParImpar(20);
ParImpar(12875698);