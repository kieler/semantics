for I in $(find . -name "main.c")
do
  cat main.test.json.base >> ${I::-2}.test.json
done
