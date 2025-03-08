<?php
    class Pessoa{
        public $nome;

        public function Falar(){
            echo $this->nome;
        }
    };

    // $pessoa = new Pessoa();

    // $pessoa->nome = "Philip";
    
    // $pessoa->Falar();

function calcularDesconto($valProd, $cat)
{
    switch ($cat) {
        case 'eletronicos':
            return $valProd - ($valProd * 0.1);
            // break;
        case 'vestuario':
            return $valProd - ($valProd * 0.2);
            // break;
        case 'alimentos':
            return $valProd - ($valProd * 0.05);
            // break;
        default:
           return $valProd;
    }
}
echo calcularDesconto(1000, 'eletronicos')."\n";
echo calcularDesconto(1000, 'vestuario')."\n";
echo calcularDesconto(1000, 'alimentos')."\n";
?>