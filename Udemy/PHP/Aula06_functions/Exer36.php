<?php
// Exer36 - Function que recebe um array e retorna um array com valores maiores que 7

function Maior7($arr){
    $maior7 = [];
    foreach($arr as $value){
        if($value>7){
            $maior7[] = $value;
        }
    }
    return $maior7;
}

echo implode(", ", Maior7([13,1,5,6,40,30,8]));
?>

<header>
    <nav>
        <ul>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </nav>
</header>