while read -r line; do
   if [[ -n "$line" ]]; then  # 빈 라인이 아닌 경우에만 export 수행
       export "$line"
       echo "$line"
   fi
done < secret.properties

if [[ -n "$line" ]]; then  # 빈 라인이 아닌 경우에만 export 수행
   export "$line"
   echo "$line"
fi