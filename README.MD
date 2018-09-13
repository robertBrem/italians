`https://github.com/robertBrem/Microservices_with_Kubernetes`

Installiere mit Ansible: `ansible-playbook playbook.yml `

```
alias kc='kubectl --kubeconfig /home/vagrant/Schreibtisch/admin.conf'
alias wkc='watch kubectl --kubeconfig /home/vagrant/Schreibtisch/admin.conf'
kc get no
kc apply -f deployment.yml
kc delete -f deployment.yml
```
