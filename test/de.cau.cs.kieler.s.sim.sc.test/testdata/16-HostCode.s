synchronous program CountDelaysTransformed ( 7 )

output signal o : integer;
output signal o2 : integer;
'int v = 0;'

state (MainState) {
	'v = v + 2;';
	'/*muh*/';
	emit(o);
	'v = v + 2;';
	emit (o2('v')); 
	if ('v == 2' and o2) {
		emit (o);
	};
	'v = v + 1;';
	pause();
	trans(MainState);
}
