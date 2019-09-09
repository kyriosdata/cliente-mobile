a4
==

Ilustra callbacks do ciclo de vida de uma atividade.
Todas elas incluem: onCreate, onStart, onResume, onPause,
onStop, onRestart e onDestroy.

Para "forçar" a chamada a todas estas callbacks é suficiente
iniciar a aplicação e, enquanto esta estiver em execução, iniciar
outra aplicação que se sobreponha a ela e, na sequência, retornar
a ela.

A sequência acima irá chamar todas as callbacks do ciclo de
vida de uma atividade. Para acompanhar, bast executar o
logcat por meio do comando abaixo:

adb logcat CicloDeVida:W *:S

Naturalmente, em vez do comando acima, você também poderá
acompanhar os registros de log por meio do IDE que está empregando.

