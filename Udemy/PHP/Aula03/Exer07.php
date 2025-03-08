<?php
    $pessoa = [
        "nome"=>"Philip",
        "idade"=>18,
        "altura"=>1.78,
        "cor"=>"Negro"
    ];
    if($pessoa['idade']>=18){
        echo $pessoa['nome']." tem ".$pessoa['idade']." anos e é maior de idade";
    }else{
        echo $pessoa['nome']." tem ".$pessoa['idade']." anos e é menor de idade";
    }
?>